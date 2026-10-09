package zd;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f59148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f59149c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f59147a = i11;
        this.f59149c = obj;
        this.f59148b = obj2;
    }

    @Override // zd.q
    public final boolean a(Object obj) {
        switch (this.f59147a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                ArrayList arrayList = (ArrayList) this.f59149c;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    if (((q) obj2).a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.f59149c).getPackageName().equals(uri2.getAuthority());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zd.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zd.f] */
    @Override // zd.q
    public final p b(Object obj, int i11, int i12, td.j jVar) {
        p pVarB;
        Uri uri;
        switch (this.f59147a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new p(new oe.b(uri2), this.f59148b.l((AssetManager) this.f59149c, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) jVar.c(ee.f.f25490b);
                return new p(new oe.b(num), new e(theme, theme != null ? theme.getResources() : ((Context) this.f59149c).getResources(), this.f59148b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.f59149c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                td.g gVar = null;
                for (int i13 = 0; i13 < size; i13++) {
                    q qVar = (q) arrayList.get(i13);
                    if (qVar.a(obj) && (pVarB = qVar.b(obj, i11, i12, jVar)) != null) {
                        gVar = pVarB.f59180a;
                        arrayList2.add(pVarB.f59182c);
                    }
                }
                if (arrayList2.isEmpty() || gVar == null) {
                    return null;
                }
                return new p(gVar, new u(arrayList2, (y4.c) this.f59148b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.f59148b).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException unused) {
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((q) this.f59149c).b(uri, i11, i12, jVar);
            default:
                Uri uri3 = (Uri) obj;
                q qVar2 = (q) this.f59148b;
                List<String> pathSegments = uri3.getPathSegments();
                p pVarB2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i14 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i14 != 0) {
                            pVarB2 = qVar2.b(Integer.valueOf(i14), i11, i12, jVar);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            uri3.toString();
                        }
                        return pVarB2;
                    } catch (NumberFormatException unused2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return pVarB2;
                        }
                        Objects.toString(uri3);
                        return pVarB2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    uri3.toString();
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.f59149c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return qVar2.b(Integer.valueOf(identifier), i11, i12, jVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                uri3.toString();
                return null;
        }
    }

    public String toString() {
        switch (this.f59147a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f59149c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public b(Resources resources, q qVar) {
        this.f59147a = 3;
        this.f59148b = resources;
        this.f59149c = qVar;
    }

    public b(Context context, f fVar) {
        this.f59147a = 1;
        this.f59149c = context.getApplicationContext();
        this.f59148b = fVar;
    }

    public b(Context context, q qVar) {
        this.f59147a = 4;
        this.f59149c = context.getApplicationContext();
        this.f59148b = qVar;
    }
}
