package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;
import java.util.List;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;


/**
 * Sends a location to the head-unit to display on a map or list.
 *
 * @since SmartDeviceLink 3.0
 *
 */
public class SendLocation extends RPCRequest{

    public static final String KEY_LAT_DEGREES          = "latitudeDegrees";
    public static final String KEY_LON_DEGREES          = "longitudeDegrees";
    public static final String KEY_LOCATION_NAME        = "locationName";
    public static final String KEY_LOCATION_DESCRIPTION = "locationDescription";
    public static final String KEY_PHONE_NUMBER         = "phoneNumber";
    public static final String KEY_ADDRESS_LINES        = "addressLines";
    public static final String KEY_LOCATION_IMAGE       = "locationImage";

    /**
     * Constructs a new SendLocation object
     */
    public SendLocation(){
        super(FunctionID.SEND_LOCATION);
    }

    /**
     * <p>
     * Constructs a new SendLocation object indicated by the Hashtable parameter
     * </p>
     * 
     * @param hash
     *            The Hashtable to use
     */
    public SendLocation(Hashtable<String, Object> hash){
        super(hash);
    }

    /**
     * Getter for longitude of the location to send.
     * @return The longitude of the location
     */
    public Float getLongitudeDegrees(){
        return (Float) parameters.get(KEY_LON_DEGREES);
    }

    /**
     * Setter for longitude of the location to send.
     * @param longitudeDegrees
     */
    public void setLongitudeDegrees(Float longitudeDegrees){
        if(longitudeDegrees != null){
            parameters.put(KEY_LON_DEGREES, longitudeDegrees);
        }
        else{
            parameters.remove(KEY_LON_DEGREES);
        }
    }

    /**
     * Getter for latitude of the location to send.
     * @return The latitude of the location
     */
    public Float getLatitudeDegrees(){
        return (Float) parameters.get(KEY_LAT_DEGREES);
    }

    /**
     * Setter for latitude of the location to send.
     * @param latitudeDegrees
     */
    public void setLatitudeDegrees(Float latitudeDegrees){
        if(latitudeDegrees != null){
            parameters.put(KEY_LAT_DEGREES, latitudeDegrees);
        }
        else{
            parameters.remove(KEY_LAT_DEGREES);
        }
    }

    /**
     * Getter for name of the location to send.
     * @return The name of the location
     */
    public String getLocationName(){
        return (String) parameters.get(KEY_LOCATION_NAME);
    }

    /**
     * Setter for name of the location to send.
     * @param locationName The name of the location
     */
    public void setLocationName(String locationName){
        if(locationName != null){
            parameters.put(KEY_LOCATION_NAME, locationName);
        }
        else{
            parameters.remove(KEY_LOCATION_NAME);
        }
    }

    /**
     * Getter for description of the location to send.
     * @return The description of the location to send
     */
    public String getLocationDescription(){
        return (String) parameters.get(KEY_LOCATION_DESCRIPTION);
    }

    /**
     * Setter for description of the location to send.
     * @param locationDescription The description of the location
     */
    public void setLocationDescription(String locationDescription){
        if(locationDescription != null){
            parameters.put(KEY_LOCATION_DESCRIPTION, locationDescription);
        }
        else{
            parameters.remove(KEY_LOCATION_DESCRIPTION);
        }
    }

    /**
     * Getter for phone number of the location to send.
     * @return
     */
    public String getPhoneNumber(){
        return (String) parameters.get(KEY_PHONE_NUMBER);
    }

    /**
     * Setter for phone number of the location to send.
     * @param phoneNumber The phone number of the location
     */
    public void setPhoneNumber(String phoneNumber){
        if(phoneNumber != null){
            parameters.put(KEY_PHONE_NUMBER, phoneNumber);
        }
        else{
            parameters.remove(KEY_PHONE_NUMBER);
        }
    }

    /**
     * Getter for address lines of the location to send.
     * @return The address lines of the location
     */
    @SuppressWarnings("unchecked")
    public List<String> getAddressLines(){
        if(parameters.get(KEY_ADDRESS_LINES) instanceof List<?>){
            List<?> list = (List<?>) parameters.get(KEY_ADDRESS_LINES);
            if(list != null && list.size() > 0){
                Object obj = list.get(0);
                if(obj instanceof String){
                    return (List<String>) list;
                }
            }
        }
        return null;
    }

    /**
     * Setter for address lines of the location to send.
     * @param addressLines The address lines of the location
     */
    public void setAddressLines(List<String> addressLines){
        if(addressLines != null){
            parameters.put(KEY_ADDRESS_LINES, addressLines);
        }
        else{
            parameters.remove(KEY_ADDRESS_LINES);
        }
    }

    /**
     * Getter for image of the location to send.
     * @return The image of the location to send
     */
    @SuppressWarnings("unchecked")
    public Image getLocationImage(){
        Object obj = parameters.get(KEY_LOCATION_IMAGE);
        if (obj instanceof Image) {
            return (Image) obj;
        } else if (obj instanceof Hashtable) {
            return new Image((Hashtable<String, Object>) obj);
        }
        return null;
    }

    /**
     * Setter for image of the location to send.
     * @param locationImage The image of the location to send
     */
    public void setLocationImage(Image locationImage){
        if(locationImage != null){
            parameters.put(KEY_LOCATION_IMAGE, locationImage);
        }
        else{
            parameters.remove(KEY_LOCATION_IMAGE);
        }
    }

}
