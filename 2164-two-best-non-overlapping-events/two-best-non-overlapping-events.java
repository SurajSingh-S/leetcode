class Solution {
    public int maxTwoEvents(int[][] events) {
        int n= events.length;
        Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));

        int [][] endTime= Arrays.copyOf(events,n);

        Arrays.sort(endTime,(a,b)->Integer.compare(a[1],b[1]));

        int j = 0;
        int maxValueBefore = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int start = events[i][0];
            int value = events[i][2];

            while (j < n && endTime[j][1] < start) {
                maxValueBefore = Math.max(maxValueBefore, endTime[j][2]);
                j++;
            }

            answer = Math.max(answer, value + maxValueBefore);
        }
         return answer;

    }
}