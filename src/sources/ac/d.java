package ac;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import xb.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.l f532b;

    public d(Uri uri, gc.l lVar) {
        this.f531a = uri;
        this.f532b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    @Override // ac.h
    public final Object a(vy.d dVar) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        gc.l lVar = this.f532b;
        ContentResolver contentResolver = lVar.f29044a.getContentResolver();
        Uri uri = this.f531a;
        if (kotlin.jvm.internal.m.a(uri.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.m.a(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && kotlin.jvm.internal.m.a(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && kotlin.jvm.internal.m.a(pathSegments.get(size - 3), "audio") && kotlin.jvm.internal.m.a(pathSegments.get(size - 2), "albums")) {
            hc.g gVar = lVar.f29047d;
            jh.h hVar = gVar.f32181a;
            hc.a aVar = hVar instanceof hc.a ? (hc.a) hVar : null;
            if (aVar != null) {
                int i11 = aVar.f32177a;
                jh.h hVar2 = gVar.f32182b;
                hc.a aVar2 = hVar2 instanceof hc.a ? (hc.a) hVar2 : null;
                if (aVar2 != null) {
                    int i12 = aVar2.f32177a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i11, i12));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
            }
        } else {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new n(new q(m00.b.c(m00.b.i(inputStreamOpenInputStream)), new xb.a()), contentResolver.getType(uri), xb.e.DISK);
    }
}
