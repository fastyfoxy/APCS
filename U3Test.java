// Tariq
//
// This program will simulate a mail/postage system.

public class U3Test
{
        private String type;
        private double weight;
        private double cost;

        public U3Test(String x, double y)
        {
            type = x;
            weight = y;
        }

        public double calculate()
        {
            if("F".equals(type))
            {
					cost = 0.34 + 0.21 * Math.ceil((weight-1));
					if(weight>13) type = "P";
            }
            if("P".equals(type))
            {
                if(weight<=16.00) cost = 3.50;
                if(weight>16.00 && weight<=32.00) cost = 3.95;
                if(weight>32.00)
                {
					cost +=3.95;
                    double x = Math.ceil((weight - 32.00) / 16.00);
                    cost = cost + 1.20 * x;
                }
            }
            return cost;
        }
}
