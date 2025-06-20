class NumArray {
        public int [] nums;
        public int n;
        public int []bit;

    public NumArray(int[] nums) {
        this.n=nums.length;
        this.nums= new int [n];
        this.bit= new int[n+1];
        for(int i=0;i<n;i++){
            update(i,nums[i]);
        }
    }

    public void addBIT(int i,int val){
        i++;
        while(i<=n){
            bit[i] += val;
            i += (i & -i);
        }
    }

    public int prefixsum (int i){
        int sum=0;
        i++;
        while(i>0){
            sum+= bit[i];
            i -= (i & -i);
        }
        return sum;
    }
    
    public void update(int i, int val) {
        int delta = val - nums[i];
        nums[i] = val;
        addBIT(i, delta);
    }
    
    public int sumRange(int left, int right) {
        return prefixsum(right)-prefixsum(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */