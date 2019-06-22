package main.behavioral.iterator;

/**
 * Created by Sara on 10/2/2017.
 */
public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);
}
