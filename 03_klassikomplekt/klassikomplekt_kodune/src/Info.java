public class Info {
    String nimetus;
    String Ram;
    String opSysteem;
        //paremklõps "generate" -> constructor
        public Info(String nimetus, String ram, String opSysteem) {
            this.nimetus = nimetus;
            Ram = ram;
            this.opSysteem = opSysteem;
        }

        public void muudaRami(){

        }

        public String kysiOpsysteemi(){
            return opSysteem;
        }
}

