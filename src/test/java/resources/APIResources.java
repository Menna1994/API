package resources;

public enum APIResources {

    RegisterAPI("api/register"),
    getUserAPI(""),
    deleteUserAPI("");
    private String resource;

    APIResources(String resource)
    {
        this.resource=resource;
    }

    public String getResource()
    {
        return resource;
    }

}
