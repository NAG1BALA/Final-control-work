package presenter;

import model.animal_class.service.Service;

import javax.swing.text.View;

public class Presenter {


    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void setWritable(Writable writable) {
        service.setWritable(writable);
    }


}
