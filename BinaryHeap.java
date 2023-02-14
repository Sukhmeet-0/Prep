public class BinaryHeap {
    private static class MaxHp{
        int []heap;
        int n;
        MaxHp(int capacity){
            heap=new int[capacity+1];
            n=0;
        }
        public boolean isEmpty(){
            System.out.println(n==0);
            return n==0;
        }
        public int getSize(){
            System.out.println(n);
            return n;
        }
        public void resize(){
            int []b=new int[2*heap.length];
            for(int i=0;i<heap.length;i++){
                b[i]=heap[i];
            }
            heap=b;
        }
        public void insert(int x){
            if(n==heap.length-1){
                resize();
            }
            n++;
            heap[n]=x;
            swim(n);
        }
        public void swim(int n){
            while(n>1 && heap[n/2]<heap[n]){
                int temp=heap[n];
                heap[n]=heap[n/2];
                heap[n/2]=temp;
                n=n/2;
            }
        }
        public void print(){
            for(int i=1;i<heap.length;i++){
                System.out.print(heap[i]+" ");
            }
            System.out.println();
        }
        public void swap(int i,int j){
            int temp=heap[i];
            heap[i]=heap[j];
            heap[j]=temp;
        }
        public int deleteMax(){
            int max=heap[1];
            swap(1,n);
            n--;
            sink(1);
            heap[n+1]=0;
            if(n>0&&(n==(heap.length-1)/4)){
                resize();
            }
            return max;
        }
        public void sink(int k){
            while(k*2<=n){
                int j=k*2;
                if(j<n&&heap[j]<heap[j+1]){
                    j++;
                }
                if(heap[k]>heap[j]){
                    break;
                }
                swap(k,j);
                k=j;
            }
        }
    }

    public static void main(String[] args) {
        MaxHp pq=new MaxHp(3);
        pq.isEmpty();
        pq.getSize();
        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);
        pq.isEmpty();
        pq.getSize();
        pq.print();
        System.out.println(pq.deleteMax());
        pq.print();

    }
}
