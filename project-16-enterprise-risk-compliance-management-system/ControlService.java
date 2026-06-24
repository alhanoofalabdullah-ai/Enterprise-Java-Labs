package src.services;

import src.models.Control;
import java.util.*;

public class ControlService {

    private List<Control> controls = new ArrayList<>();
    private int nextId = 1;

    public void createControl(String name) {
        controls.add(new Control(nextId++, name));
    }

    public int totalControls() {
        return controls.size();
    }
}
