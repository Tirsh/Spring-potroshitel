package org.example;

public class ProfilingController implements ProfilingControllerMBean{
    private boolean enable=true;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
