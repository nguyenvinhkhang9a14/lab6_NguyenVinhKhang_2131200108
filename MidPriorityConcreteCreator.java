package lab6;
public class MidPriorityConcreteCreator extends RequestCreator {
    @Override
    public Request createRequest() {
        return new MidPriorityRequest();
    }
}
