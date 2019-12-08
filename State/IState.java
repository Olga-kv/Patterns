import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public interface IState {
   String getName();
   void freeze(StateContext context);
   void heat(StateContext context);
}
