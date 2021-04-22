import java.awt.Color;

/**
 * An image filter to make the image a bit darker.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class YellowFilter extends Filter
{
    /**
     * Constructor for objects of class RedTintFilter.
     * @param name The name of the filter.
     */
    public YellowFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                int p = image.getRGB(x,y);  
                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;

                p = (a<<24) | (r<<16) | (0<<8) | 0;

                image.setRGB(x, y, p);
            }
        }
    }
}
