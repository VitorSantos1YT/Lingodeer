package j3;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z11, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z11 || !kotlin.jvm.internal.m.a(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new j(xMLReader.getContentHandler(), editable));
    }
}
