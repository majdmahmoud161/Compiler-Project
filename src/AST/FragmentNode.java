package AST;

public class FragmentNode {
    TagType tagType=new TagType();
    String TEXT;

    public TagType getTagType() {
        return tagType;
    }

    public void setTagType(TagType tagType) {
        this.tagType = tagType;
    }

    public String getTEXT() {
        return TEXT;
    }

    public void setTEXT(String TEXT) {
        this.TEXT = TEXT;
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("FragmentNode{\n");

        if(TEXT!=null ){
            sb.append("TEXT=").append(TEXT).append("\n");
        }

        if(tagType!=null ){
            sb.append("tagType=").append(tagType).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
