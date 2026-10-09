package ac;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import nv.p;
import org.xmlpull.v1.XmlPullParserException;
import oz.x;
import xb.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gc.l f527c;

    public /* synthetic */ b(Uri uri, gc.l lVar, int i11) {
        this.f525a = i11;
        this.f526b = uri;
        this.f527c = lVar;
    }

    @Override // ac.h
    public final Object a(vy.d dVar) throws XmlPullParserException, IOException {
        Integer numT0;
        Drawable drawable;
        int i11 = this.f525a;
        Uri uri = this.f526b;
        gc.l lVar = this.f527c;
        boolean z11 = true;
        switch (i11) {
            case 0:
                String strY0 = ry.m.y0(ry.m.k0(uri.getPathSegments(), 1), "/", null, null, null, 62);
                return new n(new q(m00.b.c(m00.b.i(lVar.f29044a.getAssets().open(strY0))), new xb.a()), kc.h.b(MimeTypeMap.getSingleton(), strY0), xb.e.DISK);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (oz.q.K0(authority)) {
                        authority = null;
                    }
                    if (authority != null) {
                        String str = (String) ry.m.A0(uri.getPathSegments());
                        if (str == null || (numT0 = x.t0(str)) == null) {
                            throw new IllegalStateException(p.n(uri, "Invalid android.resource URI: "));
                        }
                        int iIntValue = numT0.intValue();
                        Context context = lVar.f29044a;
                        Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strB = kc.h.b(MimeTypeMap.getSingleton(), charSequence.subSequence(oz.q.N0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!kotlin.jvm.internal.m.a(strB, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new n(new q(m00.b.c(m00.b.i(resources.openRawResource(iIntValue, typedValue2))), new xb.p(typedValue2.density)), strB, xb.e.DISK);
                        }
                        if (authority.equals(context.getPackageName())) {
                            drawable = jh.h.k(context, iIntValue);
                            if (drawable == null) {
                                throw new IllegalStateException(p.j(iIntValue, "Invalid resource ID: ").toString());
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = q4.j.f47447a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                throw new IllegalStateException(p.j(iIntValue, "Invalid resource ID: ").toString());
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof ra.q)) {
                            z11 = false;
                        }
                        if (z11) {
                            drawable = new BitmapDrawable(context.getResources(), ew.a.j(drawable, lVar.f29045b, lVar.f29047d, lVar.f29048e, lVar.f29049f));
                        }
                        return new e(drawable, z11, xb.e.DISK);
                    }
                }
                throw new IllegalStateException(p.n(uri, "Invalid android.resource URI: "));
        }
    }
}
