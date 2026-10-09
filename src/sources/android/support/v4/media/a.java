package android.support.v4.media;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.c;
import androidx.fragment.app.g1;
import androidx.fragment.app.m1;
import androidx.fragment.app.r1;
import androidx.fragment.app.x1;
import aw.a0;
import aw.b0;
import aw.c0;
import aw.d;
import aw.e0;
import aw.f;
import aw.h;
import aw.i;
import aw.j;
import aw.l;
import aw.o;
import aw.p;
import aw.w;
import aw.x;
import aw.y;
import com.google.api.Service;
import defpackage.e;
import e.b;
import i.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import p9.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f771a;

    public /* synthetic */ a(int i11) {
        this.f771a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        Uri mediaUri;
        Bundle bundle;
        p lVar = null;
        b bVar = null;
        switch (this.f771a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a(0);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f759a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MediaDescriptionCompat f760b;

                    {
                        this.f759a = parcel.readInt();
                        this.f760b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f759a + ", mDescription=" + this.f760b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i11) {
                        parcel2.writeInt(this.f759a);
                        this.f760b.writeToParcel(parcel2, i11);
                    }
                };
            case 1:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(android.support.v4.media.session.a.class.getClassLoader());
                    mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    mediaUri = null;
                }
                if (mediaUri == null) {
                    bundle = extras;
                } else if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                    bundle = null;
                } else {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = extras;
                }
                if (mediaUri == null) {
                    mediaUri = mediaDescription.getMediaUri();
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
                mediaDescriptionCompat.K = objCreateFromParcel;
                return mediaDescriptionCompat;
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new android.support.v4.media.a(4);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f772a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final long f773b;

                    {
                        this.f772a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f773b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f772a);
                        sb2.append(", Id=");
                        return e.i(this.f773b, " }", sb2);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i11) {
                        this.f772a.writeToParcel(parcel2, i11);
                        parcel2.writeLong(this.f773b);
                    }
                };
            case 5:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f774a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 6:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new android.support.v4.media.a(6);

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Object f775a;

                    {
                        this.f775a = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).f775a;
                        Object obj3 = this.f775a;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.f775a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i11) {
                        parcel2.writeParcelable((Parcelable) this.f775a, i11);
                    }
                };
            case 7:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f776a = parcel.readInt();
                parcelableVolumeInfo.f778c = parcel.readInt();
                parcelableVolumeInfo.f779d = parcel.readInt();
                parcelableVolumeInfo.f780e = parcel.readInt();
                parcelableVolumeInfo.f777b = parcel.readInt();
                return parcelableVolumeInfo;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                return new androidx.fragment.app.b(parcel);
            case 10:
                return new c(parcel);
            case 11:
                g1 g1Var = new g1();
                g1Var.f1664a = parcel.readString();
                g1Var.f1665b = parcel.readInt();
                return g1Var;
            case 12:
                m1 m1Var = new m1();
                m1Var.f1751e = null;
                m1Var.f1752f = new ArrayList();
                m1Var.f1753t = new ArrayList();
                m1Var.f1747a = parcel.createStringArrayList();
                m1Var.f1748b = parcel.createStringArrayList();
                m1Var.f1749c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                m1Var.f1750d = parcel.readInt();
                m1Var.f1751e = parcel.readString();
                m1Var.f1752f = parcel.createStringArrayList();
                m1Var.f1753t = parcel.createTypedArrayList(c.CREATOR);
                m1Var.H = parcel.createTypedArrayList(g1.CREATOR);
                return m1Var;
            case 13:
                return new r1(parcel);
            case 14:
                x1 x1Var = new x1(parcel);
                x1Var.f1868a = parcel.readString();
                return x1Var;
            case 15:
                boolean z11 = parcel.readByte() == 1;
                byte b3 = parcel.readByte();
                if (b3 == -4) {
                    lVar = z11 ? new l(parcel) : new e0(parcel);
                } else if (b3 == -3) {
                    lVar = z11 ? new d(parcel) : new w(parcel);
                } else if (b3 == -1) {
                    lVar = z11 ? new f(parcel) : new y(parcel);
                } else if (b3 == 1) {
                    lVar = z11 ? new h(parcel) : new a0(parcel);
                } else if (b3 == 2) {
                    lVar = z11 ? new aw.e(parcel) : new x(parcel);
                } else if (b3 == 3) {
                    lVar = z11 ? new i(parcel) : new b0(parcel);
                } else if (b3 == 5) {
                    lVar = z11 ? new j(parcel) : new c0(parcel);
                } else if (b3 == 6) {
                    lVar = new o(parcel);
                }
                if (lVar == null) {
                    throw new IllegalStateException(nv.p.j(b3, "Can't restore the snapshot because unknown status: "));
                }
                lVar.f3238b = z11;
                return lVar;
            case 16:
                bi.a aVar = new bi.a();
                aVar.f4450a = parcel.readInt();
                aVar.f4451b = parcel.readString();
                aVar.f4452c = parcel.readString();
                aVar.f4453d = parcel.readString();
                return aVar;
            case 17:
                bw.b bVar2 = new bw.b();
                bVar2.f6389a = parcel.readHashMap(String.class.getClassLoader());
                return bVar2;
            case 18:
                return new bw.c(parcel);
            case 19:
                e.d dVar = new e.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i11 = e.c.f24631b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(b.f24630u);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                        e.a aVar2 = new e.a();
                        aVar2.f24629a = strongBinder;
                        bVar = aVar2;
                    } else {
                        bVar = (b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f24633a = bVar;
                return dVar;
            case 20:
                e5.j jVar = new e5.j(parcel);
                jVar.f24855a = parcel.readInt();
                return jVar;
            case 21:
                String string = parcel.readString();
                m.c(string);
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    String string2 = parcel.readString();
                    m.c(string2);
                    String string3 = parcel.readString();
                    m.c(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new ec.a(string, linkedHashMap);
            case 22:
                m.f(parcel, "parcel");
                return new i.a(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 23:
                m.f(parcel, "inParcel");
                Parcelable parcelable2 = parcel.readParcelable(IntentSender.class.getClassLoader());
                m.c(parcelable2);
                return new k((IntentSender) parcelable2, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                m.f(parcel, "parcel");
                return new o9.e(parcel.readInt());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new p9.d(parcel);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new g(parcel);
            case 27:
                return new p9.j(parcel);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new p9.m(parcel);
            default:
                return new p9.w(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f771a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i11];
            case 1:
                return new MediaDescriptionCompat[i11];
            case 2:
                return new MediaMetadataCompat[i11];
            case 3:
                return new RatingCompat[i11];
            case 4:
                return new MediaSessionCompat$QueueItem[i11];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i11];
            case 6:
                return new MediaSessionCompat$Token[i11];
            case 7:
                return new ParcelableVolumeInfo[i11];
            case 8:
                return new PlaybackStateCompat[i11];
            case 9:
                return new androidx.fragment.app.b[i11];
            case 10:
                return new c[i11];
            case 11:
                return new g1[i11];
            case 12:
                return new m1[i11];
            case 13:
                return new r1[i11];
            case 14:
                return new x1[i11];
            case 15:
                return new p[i11];
            case 16:
                return new bi.a[i11];
            case 17:
                return new bw.b[i11];
            case 18:
                return new bw.c[i11];
            case 19:
                return new e.d[i11];
            case 20:
                return new e5.j[i11];
            case 21:
                return new ec.a[i11];
            case 22:
                return new i.a[i11];
            case 23:
                return new k[i11];
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new o9.e[i11];
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new p9.d[i11];
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new g[i11];
            case 27:
                return new p9.j[i11];
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new p9.m[i11];
            default:
                return new p9.w[i11];
        }
    }
}
