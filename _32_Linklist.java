public class _32_Linklist {

    class node{
        String data;
        node next; 

        node(String data){
            this.data=data;
            this.next=null;
        }
    }

    // add - first
    public void addfirst(String data){
        node newnode=new node(data);
        if(head == null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }


    public void addlast(String data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node currnode=head;
        while(currnode.next !=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }


    public void printlist(){
        if(head==null){
            System.out.print("List is Empty");
            return;
        }
        node currnode=head;
        while(currnode.next !=null){
            System.out.print(currnode.data+" -");
            currnode=currnode.next;
        }
        System.out.print("Null");
    }

    public static void main (String[] args){

        _32_Linklist list=new _32_Linklist();

        list.addfirst("is");
        list.addfirst("a");
    }
}
