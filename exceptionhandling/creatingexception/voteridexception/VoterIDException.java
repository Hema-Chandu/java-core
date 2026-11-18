package exceptionhandling.creatingexception.voteridexception;

public class VoterIDException extends Exception{
    String msg;

    public VoterIDException() {
    }

    public VoterIDException(String msg) {
        this.msg = msg;
    }

    public String getMessage(){
        return msg;
    }

}
