class cocolevio{
	
	public static void main(String[] args){
		int[] amount = {1,2,3,4,5,6,7,8,9,10};		//adds up to 55 (useful later for testing purposes)
		int[] price = {1,5,8,9,10,17,17,20,24,30};
		int N = 45;		//an integer that is smaller than the total amount of requested material (in our case, 55)
		int numCompanies = amount.length;			//in our case, 10
		
		//testing
		//call distributeMaterial function with given data and chosen n
		System.out.println(distributeMaterial(amount,price, N, numCompanies)); //121
		System.out.println(distributeMaterial(amount,price, 0, numCompanies));	//0
		System.out.println(distributeMaterial(amount,price, 3, numCompanies));	//8
		System.out.println(distributeMaterial(amount,price, 12, numCompanies));	//35
	}
	
	//maximizes profit based on given amounts, prices, and n
	public static int distributeMaterial(int[] amount, int[] price, int N, int numCompanies){
		int[][] maxProfit = new int[numCompanies+1][N+1]; 	//maxProfit[x,y] is the max profit that can be attained given only the first x companies, and y material
		for(int i = 1; i <= N; i++){
			maxProfit[0][i] = 0;	//no companies means no profit
		}
		
		for(int i = 1; i <= numCompanies; i++){				//for companies 1 to numCompanies
			for(int j = 0; j <= N; j++){					//for available material amounts 0 to N
				if (amount[i-1] > j){						//if amount requested by company i is greater than available material amount j
					maxProfit[i][j] = maxProfit[i-1][j];	//then max profit is is the same with or without that company
				}
				else{										
					//else max profit is the maximum between 
						//max profit up to but not including company i and current available amount of material 	and...
						//max profit by including company i
					maxProfit[i][j] = Math.max(maxProfit[i-1][j], maxProfit[i-1][j - amount[i-1]] + price[i-1]);
				}	
			}
		}
		
		return maxProfit[numCompanies][N];
	}
	
}
