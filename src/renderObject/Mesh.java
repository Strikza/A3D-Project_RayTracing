package renderObject;

/**
 * Based class to represent a mesh, with all basics methods
 * @author Samuel Goubeau
 */
public class Mesh {

    static final String LOG_TAG = "renderObject.Mesh";

    protected float[] vertexpos;
    protected float[] normals;
    protected float[] textures;
    protected int[] triangles;

    private float[] modelview;

    /**
     * Constructor for a mesh
     */
    public Mesh(){

        modelview = new float[16];
    }

    /**
     * Set the current modelview of the mesh with another modelview
     * @param modelviewmatrix : the modelview that will be copied
     */
    public void setModelView(final float[] modelviewmatrix){

        System.arraycopy(modelviewmatrix, 0, modelview, 0, modelviewmatrix.length);
    }

    /**
     * Transformation of the mesh by a translation of the modelview
     * @param x : translation of the position on x
     * @param y : translation of the position on y
     * @param z : translation of the position on z
     */
    public void translate(float x, float y, float z){}

    /**
     * Transformation of the mesh by a rotation of the modelview
     * @param x : rotation of the mesh on x
     * @param y : rotation of the mesh on y
     * @param z : rotation of the mesh on z
     */
    public void rotate(float angle, float x, float y, float z){}

    /**
     * Transformation of the mesh by a scale of the modelview
     * @param x : scale of all vertices on x
     * @param y : scale of all vertices on y
     * @param z : scale of all vertices on z
     */
    public void scale(float x, float y, float z){}

}
