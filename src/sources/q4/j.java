package q4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.recyclerview.widget.p2;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f47447a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f47448b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f47449c = new Object();

    public static Typeface a(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i11, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i11, TypedValue typedValue, int i12, a aVar, boolean z11, boolean z12) {
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i11) + "\" (" + Integer.toHexString(i11) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i13 = typedValue.assetCookie;
            p2 p2Var = r4.g.f48801b;
            Typeface typeface = (Typeface) p2Var.j(r4.g.b(resources, i11, string, i13, i12));
            if (typeface != null) {
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new pb.b(1, aVar, typeface));
                }
                typefaceA = typeface;
            } else if (!z12) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        c cVarK = a.k(resources.getXml(i11), resources);
                        if (cVarK != null) {
                            typefaceA = r4.g.a(context, cVarK, resources, i11, string, typedValue.assetCookie, i12, aVar, z11);
                        } else if (aVar != null) {
                            aVar.a(-3);
                        }
                    } else {
                        int i14 = typedValue.assetCookie;
                        Typeface typefaceL = r4.g.f48800a.l(context, resources, i11, string, i12);
                        if (typefaceL != null) {
                            p2Var.q(r4.g.b(resources, i11, string, i14, i12), typefaceL);
                        }
                        if (aVar != null) {
                            if (typefaceL != null) {
                                new Handler(Looper.getMainLooper()).post(new pb.b(1, aVar, typefaceL));
                            } else {
                                aVar.a(-3);
                            }
                        }
                        typefaceA = typefaceL;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (aVar != null) {
                        aVar.a(-3);
                    }
                }
            }
        } else if (aVar != null) {
            aVar.a(-3);
        }
        if (typefaceA != null || aVar != null || z12) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i11) + " could not be retrieved.");
    }
}
