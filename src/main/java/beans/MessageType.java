package beans;

/*
 * todo : Create different types of messages that will be sent
 * to handle any different cases
 */
public enum MessageType {
    IdRequest,
    IdAnswer,
    PeerJoin,
    JoinAnswer,
    Ping,
    Pong,
    BlockMined,
    Stop
}
