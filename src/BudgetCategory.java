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
    
        @Override
        public String toString() {
            return category + " " + limit + " " + spending;
        }
    }
    
