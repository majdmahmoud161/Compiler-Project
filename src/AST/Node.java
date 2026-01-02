package AST;

public class Node {
FragmentNode fragmentNode = new FragmentNode();

    public FragmentNode getFragmentNode() {
        return fragmentNode;
    }

    public void setFragmentNode(FragmentNode fragmentNode) {
        this.fragmentNode = fragmentNode;
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("Node{\n");

        if(fragmentNode!=null ){
            sb.append("fragmentNode=").append(fragmentNode).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
