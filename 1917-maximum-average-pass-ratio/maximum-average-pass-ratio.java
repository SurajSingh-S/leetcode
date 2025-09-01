class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq= new PriorityQueue<>((a,b)-> Double.compare(b[0],a[0]));


        for(int i[]:classes){
            double gain=gain(i[0],i[1]);
            pq.offer(new double[]{gain,i[0],i[1]});
        }


        for(int i=0;i< extraStudents;i++){
            double []top= pq.poll();
            int pass= (int) top[1];
            int total= (int) top[2];

            pass++;
            total++;

            pq.offer(new double[]{gain(pass,total),pass,total});
        }

        double sum=0.0;

        while(!pq.isEmpty()){
            double[] curr=pq.poll();
            sum += (double)curr[1]/curr[2];
        }

        return sum/classes.length;
        
    }

    public double gain(int pass,int total){
        double before=(double)  pass/total ;
        double after= (double)( pass + 1) / (total + 1);

        return after - before;
    }
}