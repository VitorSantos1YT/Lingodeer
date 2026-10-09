package v6;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.google.android.gms.auth.api.signin.internal.zbc;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f53581b;

    public g(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f53580a = lifecycleOwner;
        e eVar = f.f53577c;
        this.f53581b = (f) new ViewModelProvider(viewModelStore, f.f53577c).get(f.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        f fVar = this.f53581b;
        if (fVar.f53578a.h() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i11 = 0; i11 < fVar.f53578a.h(); i11++) {
                c cVar = (c) fVar.f53578a.i(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(fVar.f53578a.f(i11));
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(cVar.f53572a);
                zbc zbcVar = cVar.f53572a;
                String str3 = str2 + "  ";
                zbcVar.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(zbcVar.f8533a);
                if (zbcVar.f8534b || zbcVar.f8537e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(zbcVar.f8534b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(zbcVar.f8537e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (zbcVar.f8535c || zbcVar.f8536d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(zbcVar.f8535c);
                    printWriter.print(" mReset=");
                    printWriter.println(zbcVar.f8536d);
                }
                if (zbcVar.f8539g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(zbcVar.f8539g);
                    printWriter.print(" waiting=");
                    zbcVar.f8539g.getClass();
                    printWriter.println(false);
                }
                if (zbcVar.f8540h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(zbcVar.f8540h);
                    printWriter.print(" waiting=");
                    zbcVar.f8540h.getClass();
                    printWriter.println(false);
                }
                if (cVar.f53574c != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(cVar.f53574c);
                    d dVar = cVar.f53574c;
                    dVar.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(dVar.f53576b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                zbc zbcVar2 = cVar.f53572a;
                T value = cVar.getValue();
                zbcVar2.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                if (value == 0) {
                    sb2.append("null");
                } else {
                    Class<?> cls = value.getClass();
                    sb2.append(cls.getSimpleName());
                    sb2.append("{");
                    sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb2.append("}");
                }
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(cVar.hasActiveObservers());
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f53580a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
