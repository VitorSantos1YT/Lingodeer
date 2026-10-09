package app.rive.runtime.kotlin.fonts;

import java.lang.ref.WeakReference;
import java.util.List;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface FontFallbackStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static WeakReference<FontFallbackStrategy> stylePickerRef;

        private Companion() {
        }

        public final native void cppResetFontCache();

        public final FontFallbackStrategy getStylePicker() {
            WeakReference<FontFallbackStrategy> weakReference = stylePickerRef;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final List<byte[]> pickFont(int i11) {
            FontFallbackStrategy stylePicker = getStylePicker();
            return stylePicker == null ? r.f50854a : stylePicker.getFont(Fonts.Weight.Companion.fromInt(i11));
        }

        public final void setStylePicker(FontFallbackStrategy fontFallbackStrategy) {
            if (getStylePicker() != fontFallbackStrategy) {
                stylePickerRef = fontFallbackStrategy != null ? new WeakReference<>(fontFallbackStrategy) : null;
                cppResetFontCache();
            }
        }
    }

    List<byte[]> getFont(Fonts.Weight weight);
}
