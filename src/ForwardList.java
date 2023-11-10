public class ForwardList {
    Element Head;
    int size;
    public ForwardList(){
        this.Head = null;
        size = 0;
        System.out.println("Lconstructor: " + Integer.toHexString(this.hashCode()));
    }
    ForwardList(ForwardList other)
    {
        System.out.println("LCopyConstructor:" + Integer.toHexString(hashCode()));
        //Shallow copy - Поверхностное копирование
        //this.Head = other.Head;
        //this.size = other.size;
        for(Element Temp = other.Head; Temp != null; Temp = Temp.getNext())
            this.push_front(Temp.getData());
        reverse();
    }
    public void reverse()
    {
        ForwardList reverse = new ForwardList();
        while(Head != null)
        {
            reverse.push_front(Head.Data);
            pop_front();
        }
        this.Head = reverse.Head;
        reverse.Head = null;
    }

    public void push_front(int Data){
        Element New = new Element(Data);
        New.setNext(Head);
        Head = New;
       // Head = new Element(Data, Head);
        size ++;
    }

    public void push_back (int Data){
        if (Head == null){
            push_front(Data);
            size --;
            return;
        }
        Element Temp = Head;
        while (Temp.getNext() !=null)
            Temp = Temp.getNext();
        Temp.setNext(new Element(Data));
    }
    public void pop_front (){
        Head = Head.getNext();
        size--;
    }
    public void pop_back()
    {
        Element Temp = Head;
        while (Temp.getNext().getNext() != null){
            Temp = Temp.getNext();
        }
            Temp.setNext(null);
        size--;

    }
    void insert (int Data, int Index){
        if (Index == 0) {
            push_front(Data);
            return;
        }
            if (Index > size) return;

        Element Temp = Head;
        for (int i = 0; i < Index - 1; i++) {
            Temp = Temp.getNext();

        }
       Element New = new Element(Data);
       New.setNext(Temp.getNext());
       Temp.setNext(New);
      // Temp.setNext(new Element(Data,Temp.getNext()));
        size ++;
    }
    void erase (int Index){
        Element Temp = Head;
        if (Index == 0) {
            Head = Temp.getNext();
            return;
        }
        if (Index >= size) return;

        for (int i = 0; i < Index - 1; i++) {
            Temp = Temp.getNext();
        }
        Temp.setNext(Temp.getNext().getNext());
        size --;
    }
    void revers (ForwardList list){
        Element Temp = Head;

                while (Temp.getNext() !=null) {
                for (int j = 0; j < size-1; j++) {
                    Head = Temp.getNext();
                }
        }
    }

    void clear (){
        Head = null;
        System.out.println("Список удален");
    }

    public void print (){
        Element Temp = Head;
        while (Temp !=null)
        {
            System.out.print(Temp.getData() + "\t");
            Temp=Temp.getNext();
        }
        System.out.println();
    }
}
