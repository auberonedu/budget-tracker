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

        //getDiff method
        public double getDiff() {
            return spending - limit;
        }
    
        //toString method
        @Override
        public String toString() {
            return "Category: "+ category + " Limit: $ " + limit + " Spending: $ " + spending;
        }
    }
    
