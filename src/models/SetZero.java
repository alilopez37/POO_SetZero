package models;

public class SetZero {
    private short[][] data;

    public void setSize(short y, short x) {
        data = new short[y][x];
    }

    public short[][] getData() {
        return data;
    }

    public void setData(short[][] array){
        /*for (short i=0;i<data.length;i++)
            for (short j=0;j<data[0].length;j++)
                data[i][j] = array[i][j];
        */
        data = array;
    }

    public void run() {
        for (short i=0;i< data.length;i++)
            for (short j=0;j<data[0].length;j++)
                if (data[i][j] == 0) {
                    setRow(i);
                    setCol(j);
                }
        setZero();
    }
    public void setZero() {
        for (short i=0;i< data.length;i++)
            for (short j=0;j<data[0].length;j++)
                if (data[i][j] == -1)
                    data[i][j] = 0;
    }
    public void setRow(short f){
        for (short x=0;x<data[f].length;x++)
            if (data[f][x] != 0)
                data[f][x] = -1;
    }
    public void setCol(short c) {
        for (short y=0;y<data.length;y++)
            if (data[y][c] != 0)
                data[y][c] = -1;
    }

}
