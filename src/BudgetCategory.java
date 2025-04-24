public class BudgetCategory {
        private double limit;
        private double spending;
        private String category;
    
        public BudgetCategory(String category, double limit, double spending) {
            this.category = category;
            this.limit = limit;
            this.spending = spending;
        }
    
        public double getLimit() {
            return limit;
        }
    
        public double getSpending() {
            return spending;
        }
    
        public String getCategory() {
            return category;
        }
        
        /**
         * @param other
         * @return
         */
        @Override 
        public int compareTo(BudgetCategory other) {
            return Double.compare(this.getDiff(), other.getDiff());
        }

        @Override
        public String toString() {
            return category + " " + limit + " " + spending;
        }
        public double getDiff(){
            return spending - limit;
        }
    }
    
