package com.florianingerl.util.regex;

/**
 * A reasonable default implementation of {@link CaptureReplacer}.
 *
 * <p>
 * A {@link CaptureTreeNode} is replaced by the replacement strings of all its
 * children (ignoring those inside lookarounds) and the text in between the
 * children.
 * </p>
 *
 * @author Florian Ingerl
 * @see Matcher#replaceAll(CaptureReplacer)
 */
public class DefaultCaptureReplacer implements CaptureReplacer {

    private CharSequence input;

    @Override
    public CharSequence getInput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void setInput(CharSequence input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A {@link CaptureTreeNode} is replaced by the replacement strings of all
     * its children (ignoring those inside lookarounds) and the text in between
     * the children.
     */
    @Override
    public String replace(CaptureTreeNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
