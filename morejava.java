 public static int[] sumEchDiagonalColumns(int [][]a){
            int [] eachDiagonalSum = new int [a[0].length];
            for (int diagonal = 0; diagonal < a[0].length; diagonal++){
                eachDiagonalSum[diagonal] = 0;
                for (int elementInDiagonal = 0; elementInDiagonal < a.length; elementInDiagonal++){
                    eachDiagonalSum[diagonal]  += a[(diagonal+elementInDiagonal) % a.length][elementInDiagonal];
                }
            }
        
            return eachDiagonalSum;
        }

        public static int[][] changeRowsAndColumnsMatrixTranspositions (int [][]a){
        int b[][] = new int[a[0].length][a.length];    
        for (int columns = 0; columns < a.length; columns++){
            for (int rows = 0; rows < a[0].length; rows++){
                
                b[rows][columns] = a[columns][rows];
}
}
        return b;
}
        public static int maxValueInWhichRow (int[][]a){
            int maxNumber = a[0][0];
            int maxIndex = 0;
            for (int rows = 0; rows < a.length; rows++){
                for (int columns = 0; columns < a[0].length; columns++){
                    if (maxNumber < a[rows][columns]){
                        maxNumber = a[rows][columns];
                        maxIndex = rows;
                    
                    }
                }
            }
                return maxIndex;
            
            
        }
        
        public static int sumOfAllMaxValuesInRows (int[][]a){
            int sum = 0;
            int maxNumber = a[0][0];
            for (int rows = 0; rows < a.length; rows++){ 
                maxNumber = a[rows][0]; 
                for (int columns = 0; columns < a[0].length; columns++){
                    if (maxNumber < a[rows][columns]){
                        maxNumber = a[rows][columns];
                    }  

                }
                sum = sum + maxNumber;
             }
            
             return sum;
        }

        public static int sumOfAllMaxValuesColumns (int [][]a){
            
            return (sumOfAllMaxValuesInRows(changeRowsAndColumnsMatrixTranspositions(a)));
}
        public static int[][] sumOfTwo2dArrays (int [][]a, int [][]c){
            int b[][] = new int [a.length][a[0].length];
            for (int rows = 0; rows < a.length; rows++){ 
                for (int columns = 0; columns < a[0].length; columns++){
                    b[rows][columns] = a[rows][columns] + c[rows][columns];
                }
            }
            return b;
        }
        public static int[][] productOfTwo2dArrays (int [][]a, int [][]c){
            int b[][] = new int [a.length][c[0].length];
            for (int rows = 0; rows < b.length; rows++){ 
                for (int columns = 0; columns < b[0].length; columns++){
                    for (int sth = 0; sth < a.length; sth++){ 
                    b[rows][columns] = (a[rows][sth])*(c[sth][columns]);
                    
                    }
                }
            }
            return b;
        }
}
            
        
        
                   
                       
