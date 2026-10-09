package ud;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f52912c = {"_data"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f52913d = {anrPHlQ.DbJ};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f52915b;

    public /* synthetic */ b(ContentResolver contentResolver, int i11) {
        this.f52914a = i11;
        this.f52915b = contentResolver;
    }

    @Override // ud.d
    public final Cursor a(Uri uri) {
        switch (this.f52914a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f52915b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f52912c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f52915b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f52913d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
