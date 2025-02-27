package lab6;
public class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public Request createRequest() {
        return new HighPriorityRequest();
    }
}
