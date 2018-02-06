package patterns.proxy;

class Host {

    private String ip;

    public Host(String desc) {
        this.ip = desc;
    }

    public String connect(){
        return "connection";
    }

}