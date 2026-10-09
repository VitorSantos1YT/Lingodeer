package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, boolean z11, int i11) {
        super(contentResolver, uri, z11);
        this.f7651e = i11;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f7651e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.m
    public final void c(Object obj) throws IOException {
        switch (this.f7651e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.m
    public final Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f7651e) {
            case 0:
                boolean z11 = this.f7674a;
                ContentResolver contentResolver2 = this.f7676c;
                AssetFileDescriptor assetFileDescriptorC = (z11 && ud.a.b(uri) && ud.a.a()) ? ud.a.c(contentResolver2, uri) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorC != null) {
                    return assetFileDescriptorC;
                }
                throw new FileNotFoundException(p.n(uri, "FileDescriptor is null for: "));
            default:
                boolean z12 = this.f7674a;
                ContentResolver contentResolver3 = this.f7676c;
                AssetFileDescriptor assetFileDescriptorC2 = (z12 && ud.a.b(uri) && ud.a.a()) ? ud.a.c(contentResolver3, uri) : contentResolver3.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorC2 != null) {
                    return assetFileDescriptorC2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(p.n(uri, "FileDescriptor is null for: "));
        }
    }
}
