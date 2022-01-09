package home_work_4.dto;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T>{
    private T[] data;

    public T get(int index){
        return index< data.length ?
                data[index] : null;
    }

    public T[] getItems(){
        return data;
    }

    public DataContainer(T[] data) {
        this.data = data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        int i;
        for (i=0; i< data.length; i++) {
            if (data[i]==null){
                data[i]=item;
                return i;
            }

        }
        setData(Arrays.copyOf(data, data.length+1));
        data[data.length-1]=item;
        return data.length-1;
    }

    public boolean delete(int index){
        if (index>= data.length){
            return false;
        }
        data[index]=null;
        endShiftNull();
        setData(Arrays.copyOf(data,data.length-1));
        return true;
    }

    public boolean delete(T item){
        boolean exist=false;
        int i=0;
        for (T tmp:data) {
            if (tmp ==item){
                data[i]=null;
                exist=true;
                break;
            }
            i++;
        }

        endShiftNull();
        if(exist)
            setData(Arrays.copyOf(data,data.length-1));
        return exist;
    }

    public void endShiftNull(){
        for (int j = 0; j < data.length; j++) {
        for (int i=0; i<data.length-1;i++){
            if(data[i]==null) {
                data[i] = data[i+1];
                data[i+1]=null;
            }
        }
    }
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + Arrays.toString(whatToWrite()) +
                '}';
    }

    public T[] whatToWrite(){
        T[] result=data;
        for (int i = 0; i < data.length; i++) {
            delete(null);
        }
        return data;
    }

    public void sort(Comparator<T> comparator) {
       
        for (int j = 0; j < data.length-2; j++) {
             for (int i = 0; i < data.length - 1; i++) {
                 if (comparator.compare(data[i], data[i + 1]) > 0) {
                    T temp=data[i+1];
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }
        }

    }
    
    public static void sort(DataContainer<? extends Comparable> dataContainer){
        for (int j = 0; j < dataContainer.data.length-2; j++) {
            for (int i = 0; i < dataContainer.data.length - 1; i++) {
                if (dataContainer.data[i].compareTo(dataContainer.data[i+1]) > 0) {
                    dataContainer.change(dataContainer.data[i], dataContainer.data[i+1]);
                }
            }
        }
    }

    private void change(Comparable o1, Comparable o2) {
        Comparable temp=o1;
        o1=o2;
        o2=temp;
    }

    public static void sort(DataContainer<? extends Comparator> container, Comparator<DataContainer> comparator){
        for (int j = 0; j < container.data.length-2; j++) {
            for (int i = 0; i < container.data.length - 1; i++) {
                if (comparator.compare(container.data[i], container.data[i+1]) > 0) {
                    container.change(container.data[i], container.data[i+1]);
                }
            }
        }
    }

    private void change(Comparator o1, Comparator o2) {
        Comparator temp=o1;
        o1=o2;
        o2=temp;
    }
}
