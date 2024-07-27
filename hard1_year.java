public class hard1_year {
        public static String getDayOfWeek(int day, int month, int year) {
            if (month < 3) {
                month += 12;
                year -= 1;
            }

            int K = year % 100;
            int J = year / 100;

            int f = day + 13 * (month + 1) / 5 + K + K / 4 + J / 4 + 5 * J;
            int dayOfWeek = f % 7;

            String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

            return daysOfWeek[dayOfWeek];
        }

        public static void main(String[] args) {
            int day = 15;
            int month = 7;
            int year = 2024;

            System.out.println(getDayOfWeek(day, month, year)); // Output: Monday
        }
    }


