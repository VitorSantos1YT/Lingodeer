package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultParser {
    static {
        new BookmarkDoCoMoResultParser();
        new AddressBookDoCoMoResultParser();
        new EmailDoCoMoResultParser();
        new AddressBookAUResultParser();
        new VCardResultParser();
        new BizcardResultParser();
        new VEventResultParser();
        new EmailAddressResultParser();
        new SMTPResultParser();
        new TelResultParser();
        new SMSMMSResultParser();
        new SMSTOMMSTOResultParser();
        new GeoResultParser();
        new WifiResultParser();
        new URLTOResultParser();
        new URIResultParser();
        new ISBNResultParser();
        new ProductResultParser();
        new ExpandedProductResultParser();
        new VINResultParser();
        Pattern.compile("\\d+");
        Pattern.compile("&");
        Pattern.compile("=");
    }
}
