package Entry;

public class MyEntry implements Entry{
    Object key;
    Object value;

    public MyEntry(){
    }
    public MyEntry(Object k, Object v){
        this.key=k;
        this.value=v;
    }

    @Override
    public void setKey(Object k) {
        // TODO Auto-generated method stub
        this. key = k;
        throw new UnsupportedOperationException("Unimplemented method 'setKey'");
    }

    @Override
    public void setValue(Object v) {
        this.value = v;
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setValue'");
    }

    @Override
    public Object getKey() {
        // TODO Auto-generated method stub
        return key;
    }

    @Override
    public Object getValue() {
        // TODO Auto-generated method stub
        return value;
    }

    
}
