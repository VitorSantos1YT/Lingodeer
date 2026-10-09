package pm;

import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0;
    }

    public final int hashCode() {
        return e.a(Boolean.hashCode(false) * 31, CropImageView.DEFAULT_ASPECT_RATIO, 31);
    }

    public final String toString() {
        return "JPSyllableIntroductionUiState(isContentReady=false, downloadProgress=0.0, content=null)";
    }
}
