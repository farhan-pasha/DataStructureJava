public interface List {
    public int size();
    public boolean isEmpty();
    public Position current_head() throws ListEmptyException;
    public Position prev(Position p) throws BoundaryViolationException;
    public Position next(Position p) throws BoundaryViolationException;
    public Position insertFirst (Object e) throws NotEmptyException;
    public Position insertBefore(Position p, Object e)throws NotEmptyException;
    public Position insertAfter(Position p, Object e)throws NotEmptyException;
    public Object replace(Position p, Object e);
    public Object remove(Position p);
}
