public class Hashtable {
    private HashNode[]buckets;
    private  int numOfBuckets;
    private int size;
    public Hashtable(){
        this(10);
    }
    public Hashtable(int capacity){
        this.numOfBuckets=capacity;
        buckets=new HashNode[numOfBuckets];
        this.size=0;
    }
    private class HashNode{
        private Integer key;
        private String value;
        private HashNode next;
        public HashNode(Integer key,String value){
            this.key=key;
            this.value=value;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void put(Integer key,String value){
        if(key==null || value==null){
            throw new IllegalArgumentException("Key or value not found !!");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        size++;
        head=buckets[bucketIndex];
        HashNode node=new HashNode(key,value);
        node.next=head;
        buckets[bucketIndex]=node;
    }
    private int getBucketIndex(Integer key){
        return key %numOfBuckets;
    }
    public String get(Integer key){
        if(key==null){
            throw new IllegalArgumentException("Key not found !!");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public String remove(Integer key){
        if(key==null){
            throw new IllegalArgumentException("Key not found!!");
        }
        int bucketIndex=getBucketIndex(key);
        HashNode head=buckets[bucketIndex];
        HashNode previous=null;
        while(head!=null){
            if(head.key.equals(key)){
                break;
            }
            previous=head;
            head=head.next;
        }
        if(head==null){
            return null;
        }
        size--;
        if(previous!=null){
            previous.next=head.next;
        }else{
            buckets[bucketIndex]=head.next;
        }
        return head.value;
    }
    public static void main(String[] args) {
        Hashtable t=new Hashtable(10);
        t.put(105,"Tom");
        t.put(21,"Sana");
        t.put(21,"Harry");
        t.put(31,"Dinesh");
        System.out.println(t.size());
        System.out.println(t.get(31));
        System.out.println(t.get(21));
        System.out.println(t.get(90));
        System.out.println(t.remove(31));
        System.out.println(t.size());
    }
}
