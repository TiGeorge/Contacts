import java.util.Arrays;

class AsciiCharSequence implements CharSequence {
    // implementation
    private byte[] value;

    public AsciiCharSequence(byte[] value) {
        this.value = value.clone();
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int i) {
        return (char) value[i];
    }

    @Override
    public AsciiCharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(value, i, i1));
    }

    @Override
    public String toString() {
        return new String(value);
    }
}
