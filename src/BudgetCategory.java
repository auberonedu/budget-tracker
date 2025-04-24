public class BudgetCategory implements Comparable<BudgetCategory> {
        private double limit;
        private double spent;
        private String category;
    
        public BudgetCategory(String category, double limit, double spent) {
            this.category = category;
            this.limit = limit;
            this.spent = spent;
        }
    
        public double getLimit() {
            return limit;
        }
    
        public double getSpent() {
            return spent;
        }
    
        public String getCategory() {
            return category;
        }

        //getDiff method
        public double getDiff() {
            return spent - limit;
        }

        @Override
    public int compareTo(BudgetCategory other) {
        return Double.compare(this.getDiff(), other.getDiff());
    }
    
        //toString method
        @Override
        public String toString() {
            return "Category: "+ category + " Limit: $ " + limit + " Spent: $ " + spent;
        }
    }
    
