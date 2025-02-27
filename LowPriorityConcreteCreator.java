package lab6;
public class LowPriorityConcreteCreator extends RequestCreator {
    @Override
    public Request createRequest() {
        return new LowPriorityRequest();
    }
}
