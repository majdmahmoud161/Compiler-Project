package AST;

public class ConditionJinja2{
   ForJinja2 forJinja2;
   IfJinja2 ifJinja2;
   ElifJinja2 elifJinja2;
   ElseJinja2 elseJinja2;

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder("ConditionJinja2 {\n ");

      if (forJinja2 != null) {
         sb.append("forJinja2=").append(forJinja2).append(",");
      }
      if (ifJinja2 != null) {
         sb.append("ifJinja2=").append(ifJinja2).append(",");
      }
      if (elifJinja2 != null) {
         sb.append("elifJinja2=").append(elifJinja2).append(",");
      }
      if (elseJinja2 != null) {
         sb.append("elseJinja2=").append(elseJinja2).append(",");
      }

      sb.append("\n}");
      return sb.toString();
   }

}
