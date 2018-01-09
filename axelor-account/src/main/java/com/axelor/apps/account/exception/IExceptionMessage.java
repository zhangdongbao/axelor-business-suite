/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2018 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.account.exception;

/**
 * Interface of Exceptions. Enum all exception of axelor-account.
 *
 * @author dubaux
 *
 */
public interface IExceptionMessage {


	static final String INVOICE_LINE_TAX_LINE = /*$$(*/ "Il manque une ligne de taxe"/*)*/ ;
	/**
	 * Bank statement service
	 */

	static final String BANK_STATEMENT_1 = /*$$(*/ "%s :\n Computed balance and Ending Balance must be equal" /*)*/ ;
	static final String BANK_STATEMENT_2 = /*$$(*/ "%s :\n MoveLine amount is not equals with bank statement line %s" /*)*/ ;
	static final String BANK_STATEMENT_3 = /*$$(*/ "%s :\n Bank statement line %s amount can't be null" /*)*/ ;

	/**
	 * Move service
	 */

	static final String NO_MOVES_SELECTED = /*$$(*/ "Please select 'Draft' or 'Simulated' moves" /*)*/ ;
	static final String MOVE_VALIDATION_NOT_OK = /*$$(*/ "Error in move validation, please check the log" /*)*/ ;
	static final String MOVE_VALIDATION_OK = /*$$(*/ "Moves validated successfully" /*)*/;


	/**
	 * Account management service
	 */
	static final String ACCOUNT_MANAGEMENT_1_ACCOUNT = /*$$(*/ "Accounting configuration is missing for Product: %s (company: %s)" /*)*/ ;

	/**
	 * Mail service
	 */
	static final String MAIL_1 = /*$$(*/ "%s :\n Please define an email template for cash register (company: %s)" /*)*/ ;

	/**
	 * Account clearance service and controller
	 */
	static final String ACCOUNT_CLEARANCE_1 = /*$$(*/ "%s :\n You must configure account informations for the company %s" /*)*/ ;
	static final String ACCOUNT_CLEARANCE_2 = /*$$(*/ "%s :\n You must configure a financial account for then company %s" /*)*/ ;
	static final String ACCOUNT_CLEARANCE_3 = /*$$(*/ "%s :\n You must configure a tax standard rate for the company %s" /*)*/ ;
	static final String ACCOUNT_CLEARANCE_4 = /*$$(*/ "%s :\n You must configure account clearance for the company %s" /*)*/ ;
	static final String ACCOUNT_CLEARANCE_5 = /*$$(*/ "%s :\n Veuillez configurer une séquence Apurement des trop-perçus pour la société %s" /*)*/ ;
	static final String ACCOUNT_CLEARANCE_6 = /*$$(*/ "%s :\n You must configure an overpayment account clearance journal for the company %s" /*)*/ ;
	static final String ACCOUNT_CLEARANCE_7 = /*$$(*/ "Move lines generated" /*)*/ ;

	/**
	 * Account customer service
	 */
	static final String ACCOUNT_CUSTOMER_1 = /*$$(*/ "%s :\n A customer account is missing for the company %s" /*)*/ ;
	static final String ACCOUNT_CUSTOMER_2 = /*$$(*/ "%s :\n A supplier account is missing for the company %s" /*)*/ ;

	/**
	 * Cash register line service
	 */
	static final String CASH_REGISTER_1 = /*$$(*/ "%s :\n You must configure an active company for the user %s" /*)*/ ;
	static final String CASH_REGISTER_2 = /*$$(*/ "%s :\n A cash register closure already exists for the same date and the same cash register" /*)*/ ;
	static final String CASH_REGISTER_3 = /*$$(*/ "%s :\n You must configure a cashier email address for the company %s" /*)*/ ;

	/**
	 * Check rejection service
	 */
	static final String CHECK_REJECTION_1 = /*$$(*/ "%s :\n You must configure a cheque rejection sequence for the company %s" /*)*/ ;

	/**
	 * Interbank payment order import service
	 */
	static final String INTER_BANK_PO_IMPORT_1 = /*$$(*/ "%s :\n The invoice n°%s has not been found for the company %s" /*)*/ ;

	/**
	 * Interbank payment order reject import service
	 */
	static final String INTER_BANK_PO_REJECT_IMPORT_1 = /*$$(*/ "%s \n There is no invoice corresponding to the number %s and the company %s" /*)*/ ;
	static final String INTER_BANK_PO_REJECT_IMPORT_2 = /*$$(*/ "%s - There is no payment mode configured for the invoice %s" /*)*/ ;
	static final String INTER_BANK_PO_REJECT_IMPORT_3 = /*$$(*/ "%s :\n The payment mode with 'TIC' code has not been found" /*)*/ ;
	static final String INTER_BANK_PO_REJECT_IMPORT_4 = /*$$(*/ "%s :\n The payment mode with 'TIP' code has not been found" /*)*/ ;

	/**
	 * Irrecoverable service and controller
	 */
	static final String IRRECOVERABLE_1 = /*$$(*/ "Timetable ligne %s" /*)*/ ;
	static final String IRRECOVERABLE_2 = /*$$(*/ "%s :\n Error generated on invoice creation shift to irrecoverable %s" /*)*/ ;
	static final String IRRECOVERABLE_3 = /*$$(*/ "%s :\n La facture %s ne possède pas de pièce comptable dont le restant à payer est positif" /*)*/ ;
	static final String IRRECOVERABLE_4 = /*$$(*/ "%s :\n You must configure shit to irrecoverable sequence for the company %s" /*)*/ ;
	static final String IRRECOVERABLE_5 = /*$$(*/ "Treatment finished" /*)*/ ;
	static final String IRRECOVERABLE_6 = /*$$(*/ "Anomalies generated" /*)*/ ;
	static final String IRRECOVERABLE_7 = /*$$(*/ "You must select a printing type" /*)*/ ;

	/**
	 * Journal service
	 */
	static final String JOURNAL_1 = /*$$(*/ "Invoice type missing on invoice %s" /*)*/ ;

	/**
	 * Move line export service
	 */
	static final String MOVE_LINE_EXPORT_1 = /*$$(*/ "%s :\n Error : You must configure a sale interface sequence for the company %s" /*)*/ ;
	static final String MOVE_LINE_EXPORT_2 = /*$$(*/ "%s :\n Error : You must configure a credit note interface sequence for the company %s" /*)*/ ;
	static final String MOVE_LINE_EXPORT_3 = /*$$(*/ "%s :\n Error : You must configure a treasury interface sequence for the company %s" /*)*/ ;
	static final String MOVE_LINE_EXPORT_4 = /*$$(*/ "%s :\n Error : You must configure a purchase interface sequence for the company %s" /*)*/ ;

	/**
	 * Move line report service and controller
	 */
	static final String MOVE_LINE_REPORT_1 = /*$$(*/ "%s :\n Error : You must configure an account reporting sequence for the company %s" /*)*/ ;
	static final String MOVE_LINE_REPORT_2 = /*$$(*/ "%s :\n Error : You must configure an account export sequence for the company %s" /*)*/ ;
	static final String MOVE_LINE_REPORT_3 = /*$$(*/ "Move lines recovered" /*)*/ ;
	static final String MOVE_LINE_REPORT_4 = /*$$(*/ "You must select an export type" /*)*/ ;
	static final String MOVE_LINE_REPORT_6 = /*$$(*/ "Moves exported" /*)*/ ;

	/**
	 * Move line service
	 */
	static final String MOVE_LINE_1 = /*$$(*/ "Partner is missing on the invoice %s" /*)*/ ;
	static final String MOVE_LINE_2 = /*$$(*/ "Partner account missing on the invoice %s" /*)*/ ;
	static final String MOVE_LINE_3 = /*$$(*/ "Product missing on invoice line, invoice : %s (company : %s)" /*)*/ ;
	static final String MOVE_LINE_4 = /*$$(*/ "Account missing on configuration for line : %s (company : %s)" /*)*/ ;
	static final String MOVE_LINE_5 = /*$$(*/ "Analytic account %s associated to sales account for the product %s is not configured : (company : %s)" /*)*/ ;
	static final String MOVE_LINE_6 = /*$$(*/ "Account missing on the tax line : %s (company : %s)" /*)*/ ;

	/**
	 * Move service
	 */
	static final String MOVE_1 = /*$$(*/ "Invoice type missing on invoice %s" /*)*/ ;
	static final String MOVE_2 = /*$$(*/ "You must select a journal for the move" /*)*/ ;
	static final String MOVE_3 = /*$$(*/ "You must select a company for the move" /*)*/ ;
	static final String MOVE_4 = /*$$(*/ "You must select a period for the move" /*)*/ ;
	static final String MOVE_5 = /*$$(*/ "Journal %s does not have any account move sequence configured" /*)*/ ;
	static final String MOVE_6 = /*$$(*/ "Move account sens %s can't be determined" /*)*/ ;
	static final String MOVE_7 = /*$$(*/ "Account move %s has a total debit different than total credit : %s <> %s" /*)*/ ;

	/**
	 * Payment schedule export service
	 */
	static final String PAYMENT_SCHEDULE_1 = /*$$(*/ "%s :\n You must configure a RIB for payment timetable %s" /*)*/ ;
	static final String PAYMENT_SCHEDULE_2 = /*$$(*/ "%s :\n You must configure a RIB for the partner %s" /*)*/ ;
	static final String PAYMENT_SCHEDULE_3 = /*$$(*/ "%s :\n Error : You must configure a direct debit date for the %s batch configuration" /*)*/ ;
	static final String PAYMENT_SCHEDULE_4 = /*$$(*/ "%s :\n You must configure a direct debit reject sequence\n for the company %s for the journal %s" /*)*/ ;
	static final String PAYMENT_SCHEDULE_5 = /*$$(*/ "Veuillez configurer une séquence Echéancier pour la société %s" /*)*/ ;
	static final String PAYMENT_SCHEDULE_6 = /*$$(*/ "%s :\n Error : You must, at first, create timetable lines for the timetable %s" /*)*/ ;

	/**
	 * Reconcile service
	 */
	static final String RECONCILE_1 = /*$$(*/ "%s :\n Reconciliation : You must fill concerned moves lines." /*)*/ ;
	static final String RECONCILE_2 = /*$$(*/ "%s :\n Reconciliation : Selected moves lines must concerned the same account." /*)*/ ;
	static final String RECONCILE_3 = /*$$(*/ "\n (Debit %s account %s - Credit %s account %s)" /*)*/ ;
	static final String RECONCILE_4 = /*$$(*/ "%s :\n Reconciliation %s: Reconciliated amount must be different than zero. \n (Debit %s account %s - Credit %s account %s)" /*)*/ ;
	static final String RECONCILE_5 = /*$$(*/ "%s :\n Reconciliation %s: Reconciliated amount must be lower or equal to remaining amount to reconciliate from moves lines." /*)*/ ;
	static final String RECONCILE_6 = /*$$(*/ "%s :\n Error : You must configure a reconciliation sequence for the company %s" /*)*/ ;

	/**
	 * Reimbursement service and controller
	 */
	static final String REIMBURSEMENT_1 = /*$$(*/ "%s :\n You must configure a reimbursement sequence for the company %s" /*)*/ ;
	static final String REIMBURSEMENT_2 = /*$$(*/ "Export reimbursement folder (SEPA format) has not been configured for the company %s." /*)*/ ;
	static final String REIMBURSEMENT_3 = /*$$(*/ "No reimbursement found for the ref %s and the company %s." /*)*/ ;
	static final String REIMBURSEMENT_4 = /*$$(*/ "You must configure a RIB." /*)*/ ;

	/**
	 * Year service
	 */
	static final String YEAR_1 = /*$$(*/ "%s :\n You must configure a company for the fiscal year %s" /*)*/ ;

	/**
	 * Batch Account customer
	 */
	static final String BATCH_ACCOUNT_1 = /*$$(*/ "Accounting situation %s" /*)*/ ;
	static final String BATCH_ACCOUNT_2 = /*$$(*/ "Contact's account balances determination's reporting :\n" /*)*/ ;
	static final String BATCH_ACCOUNT_3 = /*$$(*/ "\t* %s Account(s) situation(s) treated\n" /*)*/ ;
	static final String BATCH_ACCOUNT_4 = /*$$(*/ "Account balances of %s accounting situation has not been updated, you must run the contact account batch update." /*)*/ ;
	static final String BATCH_ACCOUNT_5 = /*$$(*/ "Account balances from all accounts situations (%s) has been updated." /*)*/ ;

	/**
	 * Batch doubtful customer
	 */
	static final String BATCH_DOUBTFUL_1 = /*$$(*/ "Doubtful account's determination's reporting" /*)*/ ;
	static final String BATCH_DOUBTFUL_2 = /*$$(*/ "\t* %s Invoice(s) treated\n" /*)*/ ;

	/**
	 * Batch interbank payment order import
	 */
	static final String BATCH_INTERBANK_PO_IMPORT_1 = /*$$(*/ "Import's batch to TIP and cheque TIP payments %s" /*)*/ ;
	static final String BATCH_INTERBANK_PO_IMPORT_2 = /*$$(*/ "Payment to invoice %s" /*)*/ ;
	static final String BATCH_INTERBANK_PO_IMPORT_3 = /*$$(*/ "Reporting to TIP and cheque TIP payment's import :" /*)*/ ;
	static final String BATCH_INTERBANK_PO_IMPORT_4 = /*$$(*/ "%s payment(s) traited" /*)*/ ;
	static final String BATCH_INTERBANK_PO_IMPORT_5 = /*$$(*/ "Total Amount" /*)*/ ;

	/**
	 * Batch interbank payment order reject import
	 */
	static final String BATCH_INTERBANK_PO_REJECT_IMPORT_1 = /*$$(*/ "Import's batch to TIP and cheque TIP payment rejects %s" /*)*/ ;
	static final String BATCH_INTERBANK_PO_REJECT_IMPORT_2 = /*$$(*/ "Payment reject to invoice %s" /*)*/ ;
	static final String BATCH_INTERBANK_PO_REJECT_IMPORT_3 = /*$$(*/ "Reporting to TIP and cheque TIP payment rejects import" /*)*/ ;

	/**
	 * Batch move line export
	 */
	static final String BATCH_MOVELINE_EXPORT_1 = /*$$(*/ "%s :\n Error : You must configure a company for the batch configurator %s" /*)*/ ;
	static final String BATCH_MOVELINE_EXPORT_2 = /*$$(*/ "%s :\n Error : You must configure a due date for the batch configurator %s" /*)*/ ;
	static final String BATCH_MOVELINE_EXPORT_3 = /*$$(*/ "%s :\n Error : You must configure an export type for the batch configurator %s" /*)*/ ;
	static final String BATCH_MOVELINE_EXPORT_4 = /*$$(*/ "Moves export batch's reporting :\n" /*)*/ ;
	static final String BATCH_MOVELINE_EXPORT_5 = /*$$(*/ "Moves Lines (Moves) exported" /*)*/ ;


	/**
	 * Batch payment schedule import/export
	 */
	static final String BATCH_PAYMENT_SCHEDULE_1 = /*$$(*/ "Unknowned data type for the treatment %s" /*)*/ ;
	static final String BATCH_PAYMENT_SCHEDULE_2 = /*$$(*/ "Direct debit's export batch %s" /*)*/ ;
	static final String BATCH_PAYMENT_SCHEDULE_3 = /*$$(*/ "Due date's direct debit %s" /*)*/ ;
	static final String BATCH_PAYMENT_SCHEDULE_4 = /*$$(*/ "Export reporting to invoices direct debits :\n" /*)*/ ;
	static final String BATCH_PAYMENT_SCHEDULE_5 = /*$$(*/ "Invoice(s) direct debit(s) treated" /*)*/ ;
	static final String BATCH_PAYMENT_SCHEDULE_6 = /*$$(*/ "Export reporting to monthly direct debits :\n" /*)*/ ;
	static final String BATCH_PAYMENT_SCHEDULE_7 = /*$$(*/ "Monthly direct debit(s) treated" /*)*/ ;
	static final String BATCH_PAYMENT_SCHEDULE_8 = /*$$(*/ "%s :\n No timetable nor invoice found for the direct debit number : %s" /*)*/;
	static final String BATCH_PAYMENT_SCHEDULE_9 = /*$$(*/ "Reject %s" /*)*/;
	static final String BATCH_PAYMENT_SCHEDULE_10 = /*$$(*/ "Timetable's reject move's creation %s" /*)*/;
	static final String BATCH_PAYMENT_SCHEDULE_11 = /*$$(*/ "Invoice's reject move's creation %s" /*)*/;
	static final String BATCH_PAYMENT_SCHEDULE_12 = /*$$(*/ "Reporting to direct debit reject's import :\n" /*)*/;
	static final String BATCH_PAYMENT_SCHEDULE_13 = /*$$(*/ "Direct debit(s) rejected" /*)*/;

	/**
	 * Batch reimbursement export/import
	 */
	static final String BATCH_REIMBURSEMENT_1 = /*$$(*/ "Bug(Anomaly) generated during SEPA export - Batch %s" /*)*/;
	static final String BATCH_REIMBURSEMENT_2 = /*$$(*/ "Reporting to reimbursement creation :\n" /*)*/;
	static final String BATCH_REIMBURSEMENT_3 = /*$$(*/ "Reimbursement(s) created" /*)*/;
	static final String BATCH_REIMBURSEMENT_4 = /*$$(*/ "Reporting to reimboursement's export :\n" /*)*/;
	static final String BATCH_REIMBURSEMENT_5 = /*$$(*/ "Reimbursement(s) treated" /*)*/;
	static final String BATCH_REIMBURSEMENT_6 = /*$$(*/ "Reimbursement's import's batch %s" /*)*/;
	static final String BATCH_REIMBURSEMENT_7 = /*$$(*/ "Reimbursement reject %s" /*)*/;
	static final String BATCH_REIMBURSEMENT_8 = /*$$(*/ "Reporting to reimbursement reject's import :\n" /*)*/;
	static final String BATCH_REIMBURSEMENT_9 = /*$$(*/ "Reimbursement(s) rejected" /*)*/;

	/**
	 * Batch reminder
	 */
	static final String BATCH_REMINDER_1 = /*$$(*/ "Reminder's reporting :\n" /*)*/;
	static final String BATCH_REMINDER_2 = /*$$(*/ "Partner(s) treated" /*)*/;

	/**
	 * Batch strategy
	 */
	static final String BATCH_STRATEGY_1 = /*$$(*/ "%s :\n You must configure a RIB for batch's configurator %s" /*)*/;

	/**
	 * Cfonb export service
	 */
	static final String CFONB_EXPORT_1 = /*$$(*/ "You must configure a RIB for the reimbursement" /*)*/;
	static final String CFONB_EXPORT_2 = /*$$(*/ "%s :\n Error detected during CFONB file's writing : %s" /*)*/;
	static final String CFONB_EXPORT_3 = /*$$(*/ "%s :\n You must configure a Sort Code for the RIB %s of third-payer %s" /*)*/;
	static final String CFONB_EXPORT_4 = /*$$(*/ "%s :\n You must configure a number's account for the RIB %s of third-payer %s" /*)*/;
	static final String CFONB_EXPORT_5 = /*$$(*/ "%s :\n You must configure a Bank Code for the RIB %s of third-payer %s" /*)*/;
	static final String CFONB_EXPORT_6 = /*$$(*/ "%s :\n You must configure a Bank Address for the RIB %s of third-payer %s" /*)*/;

	/**
	 * Cfonb import service
	 */
	static final String CFONB_IMPORT_1 = /*$$(*/ "%s :\n You must configure a reject/return reason's code's list relating to Card cashing, Direct debit and TIP in general configuration" /*)*/;
	static final String CFONB_IMPORT_2 = /*$$(*/ "%s :\n A header record is missing in the file %s" /*)*/;
	static final String CFONB_IMPORT_3 = /*$$(*/ "%s :\n One or several detail records are missing in the file %s" /*)*/;
	static final String CFONB_IMPORT_4 = /*$$(*/ "%s :\n A record is missing in the file %s" /*)*/;
	static final String CFONB_IMPORT_5 = /*$$(*/ "%s :\n The total amount for the following record isn't correct (file %s) :\n %s" /*)*/;
	static final String CFONB_IMPORT_6 = /*$$(*/ "%s :\n No payment mode found for the code %s and the company %s" /*)*/;

	/**
	 * Cfonb tool service
	 */
	static final String CFONB_TOOL_1 = /*$$(*/ "%s :\n Anomaly detected (value isn't numeric : %s) for sender" /*)*/;
	static final String CFONB_TOOL_2 = /*$$(*/ "%s :\n Anomaly detected (value isn't numeric : %s) for the receiver" /*)*/;
	static final String CFONB_TOOL_3 = /*$$(*/ "%s :\n Anomaly detected (value isn't numeric : %s) for the total" /*)*/;
	static final String CFONB_TOOL_4 = /*$$(*/ "%s :\n Anomaly detected (the record doesn't have %s characters : %s) for the record %s, company %s" /*)*/;

	/**
	 * Account config service
	 */
	static final String ACCOUNT_CONFIG_1 = /*$$(*/ "%s :\n You must configure account's informations for the company %s"/*)*/;
	static final String ACCOUNT_CONFIG_2 = /*$$(*/ "%s :\n You must configure a CFONB format reimbursement's export's folder for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_3 = /*$$(*/ "%s :\n You must configure a CFONB format direct debit's export's folder for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_4 = /*$$(*/ "%s :\n You must configure a TIP and cheque TIP payment's import path for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_5 = /*$$(*/ "%s :\n You must configure a TIP and cheque TIP temporary import path for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_6 = /*$$(*/ "%s :\n You must configure a TIP and cheque TIP payment rejects path for the import file for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_7 = /*$$(*/ "%s :\n You must configure a TIP and chaque TIP temporary path for the payment reject's file for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_8 = /*$$(*/ "%s :\n You must configure a path for the reject's file for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_9 = /*$$(*/ "%s :\n You must configure a path for the temporary reject's file for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_10 = /*$$(*/ "%s :\n You must configure a path for the reimbursements rejects import's file for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_11 = /*$$(*/ "%s :\n You must configure a path for the reimbursement rejects import's temporary file for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_12 = /*$$(*/ "%s :\n You must configure a rejects journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_13 = /*$$(*/ "%s :\n You must configure an irrevocable journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_14 = /*$$(*/ "%s :\n You must configure a Supplier purchase journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_15 = /*$$(*/ "%s :\n You must configure a Supplier credit note journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_16 = /*$$(*/ "%s :\n You must configure a Sales journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_17 = /*$$(*/ "%s :\n You must configure a Customer credit note journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_18 = /*$$(*/ "%s :\n You must configure a Misc. Operation journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_19 = /*$$(*/ "%s :\n You must configure a Reimbursement journal for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_20 = /*$$(*/ "%s :\n You must configure a Sales journal type for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_21 = /*$$(*/ "%s :\n You must configure a Credit note journal type for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_22 = /*$$(*/ "%s :\n You must configure a Cash journal type for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_23 = /*$$(*/ "%s :\n You must configure a Purchase journal type for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_24 = /*$$(*/ "%s :\n You must configure an irrevocable doubtful account for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_25 = /*$$(*/ "%s :\n You must configure a customer account for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_26 = /*$$(*/ "%s :\n You must configure a supplier account for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_27 = /*$$(*/ "%s :\n You must configure a cash difference account for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_28 = /*$$(*/ "%s :\n You must configure a reimbursement account for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_29 = /*$$(*/ "%s :\n You must configure a doubtful customer account for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_30 = /*$$(*/ "%s :\n You must configure a direct debit payment mode for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_31 = /*$$(*/ "%s :\n You must configure a payment mode after reject for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_32 = /*$$(*/ "%s :\n You must configure a shift to irrecoverable's reason for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_33 = /*$$(*/ "%s :\n You must configure a exported file path (if -> AGRESSO) for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_34 = /*$$(*/ "%s :\n You must configure a reject import letter template for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_35 = /*$$(*/ "%s :\n You must configure a shifting reason (debt more than six months) for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_36 = /*$$(*/ "%s :\n You must configure a shifting reason (debt more than three months) for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_37 = /*$$(*/ "%s :\n You must configure a reminder tab for the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_38 = /*$$(*/ "%s :\n You must configure an advance payment account for the company %s" /*)*/;
	
	static final String ACCOUNT_CONFIG_SEQUENCE_1 = /*$$(*/ "%s :\n Please, configure a sequence for the customer invoices and the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_SEQUENCE_2 = /*$$(*/ "%s :\n Please, configure a sequence for the customer refunds and the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_SEQUENCE_3 = /*$$(*/ "%s :\n Please, configure a sequence for the supplier invoices and the company %s" /*)*/;
	static final String ACCOUNT_CONFIG_SEQUENCE_4 = /*$$(*/ "%s :\n Please, configure a sequence for the supplier refunds and the company %s" /*)*/;


	/**
	 * Cfonb config service
	 */
	static final String CFONB_CONFIG_1 = /*$$(*/ "%s :\n You must configure CFONB for the company %s" /*)*/;
	static final String CFONB_CONFIG_2 = /*$$(*/ "%s :\n You must configure a CFONB sender code register for the company %s" /*)*/;
	static final String CFONB_CONFIG_3 = /*$$(*/ "%s :\n You must configure a CFONB sender's number for the company %s" /*)*/;
	static final String CFONB_CONFIG_4 = /*$$(*/ "%s :\n You must configure a CFONB sender's name/corporate name for the company %s" /*)*/;
	static final String CFONB_CONFIG_5 = /*$$(*/ "%s :\n You must configure a CFONB receiver code register for the company %s" /*)*/;
	static final String CFONB_CONFIG_6 = /*$$(*/ "%s :\n You must configure a CFONB total code register for the company %s" /*)*/;
	static final String CFONB_CONFIG_7 = /*$$(*/ "%s :\n You must configure a CFONB internet payment code for the company %s" /*)*/;
	static final String CFONB_CONFIG_8 = /*$$(*/ "%s :\n You must configure a CFONB direct debit code for the company %s" /*)*/;
	static final String CFONB_CONFIG_9 = /*$$(*/ "%s :\n You must configure a CFONB header code register for the company %s" /*)*/;
	static final String CFONB_CONFIG_10 = /*$$(*/ "%s :\n You must configure a CFONB detail code register for the company %s" /*)*/;
	static final String CFONB_CONFIG_11 = /*$$(*/ "%s :\n You must configure a CFONB code register end for the company %s" /*)*/;
	static final String CFONB_CONFIG_12 = /*$$(*/ "%s :\n You must configure a CFONB rejected direct debit code for the company %s" /*)*/;
	static final String CFONB_CONFIG_13 = /*$$(*/ "%s :\n You must configure a CFONB unpaid direct debit code fir the company %s" /*)*/;
	static final String CFONB_CONFIG_14 = /*$$(*/ "%s :\n You must configure a CFONB unpaid TIP code for the company %s" /*)*/;
	static final String CFONB_CONFIG_15 = /*$$(*/ "%s :\n You must configure a CFONB TIP and cheque TIP code for the company %s" /*)*/;
	static final String CFONB_CONFIG_16 = /*$$(*/ "%s :\n You must configure a CFONB TIP code for the company %s" /*)*/;

	/**
	 * Paybox config service
	 */
	static final String PAYBOX_CONFIG_1 = /*$$(*/ "%s :\n You must configure Paybox for the company %s" /*)*/;
	static final String PAYBOX_CONFIG_2 = /*$$(*/ "%s :\n You must add a site number for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_3 = /*$$(*/ "%s :\n You must add a rank number for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_4 = /*$$(*/ "%s :\n You must add a transaction devise for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_5 = /*$$(*/ "%s :\n You must add a variables to return by Paybox's list for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_6 = /*$$(*/ "%s :\n You must add a returned URL from Paybox once payment is done for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_7 = /*$$(*/ "%s :\n You must add a returned URL from Paybox once payment is refused for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_8 = /*$$(*/ "%s :\n You must add a returned URL from Paybox once payment is canceled for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_9 = /*$$(*/ "%s :\n You must add an intern id for Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_10 = /*$$(*/ "%s :\n Veuillez selectionner un Type d'algorithme de hachage utilisé lors du calcul de l'empreinte pour la configuration Paybox %s" /*)*/;
	static final String PAYBOX_CONFIG_11 = /*$$(*/ "%s :\n You must add a calculated signature with secret key for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_12 = /*$$(*/ "%s :\n You must add an environment URL for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_13 = /*$$(*/ "%s :\n You must add a Paybox public key's path for the Paybox's configuration %s" /*)*/;
	static final String PAYBOX_CONFIG_14 = /*$$(*/ "%s :\n You must add a Axelor back-office email for Paybox for Paybox's configuration %s" /*)*/;

	/**
	 * Payer quality service
	 */
	static final String PAYER_QUALITY_1 = /*$$(*/ "%s :\n Error : You must configure a weight table in general configuration" /*)*/;

	/**
	 * Reminder action service
	 */
	static final String REMINDER_ACTION_1 = /*$$(*/ "Reminder method missing." /*)*/;
	static final String REMINDER_ACTION_2 = /*$$(*/ "Reminder line missing." /*)*/;
	static final String REMINDER_ACTION_3 = /*$$(*/ "%s : Letter template missing for reminder matrix %s (Partner %s, Level %s)." /*)*/;

	/**
	 * Reminder service
	 */
	static final String REMINDER_1 = /*$$(*/ "There's no accounting situation." /*)*/;
	static final String REMINDER_2 = /*$$(*/ "Reference date undefined." /*)*/;
	static final String REMINDER_3 = /*$$(*/ "Reminder method missing for the configuration." /*)*/;
	static final String REMINDER_4 = /*$$(*/ "Reminder level waiting for approval." /*)*/;

	/**
	 * Reminder session service
	 */
	static final String REMINDER_SESSION_1 = /*$$(*/ "Reminder method line missing." /*)*/;

	/**
	 * Invoice batch service
	 */
	static final String INVOICE_BATCH_1 = /*$$(*/ "State %s unknown for treatment %s" /*)*/;

	/**
	 * Invoice generator
	 */
	static final String INVOICE_GENERATOR_1 = /*$$(*/ "%s :\n Invoice's type is not filled %s" /*)*/;
	static final String INVOICE_GENERATOR_2 = /*$$(*/ "%s :\n There's no partner selected" /*)*/;
	static final String INVOICE_GENERATOR_3 = /*$$(*/ "%s :\n Payment condition missing" /*)*/;
	static final String INVOICE_GENERATOR_4 = /*$$(*/ "%s :\n Payment mode missing" /*)*/;
	static final String INVOICE_GENERATOR_5 = /*$$(*/ "%s :\n Invoicing address missing" /*)*/;
	static final String INVOICE_GENERATOR_6 = /*$$(*/ "%s :\n Currency missing" /*)*/;

	/**
	 * Invoice line generator
	 */
	static final String INVOICE_LINE_GENERATOR_1 = /*$$(*/ "You must select a currency for partner %s (%s)" /*)*/;
	static final String INVOICE_LINE_GENERATOR_2 = /*$$(*/ "You must select a currency for company %s" /*)*/;

	/**
	 * Batch validation
	 */
	static final String BATCH_VALIDATION_1 = /*$$(*/ "Invoice validation's reporting :\n" /*)*/;
	static final String BATCH_VALIDATION_2 = /*$$(*/ "Invoice(s) validated" /*)*/;

	/**
	 * Batch ventilation
	 */
	static final String BATCH_VENTILATION_1 = /*$$(*/ "Invoice ventilation's reporting :\n" /*)*/;
	static final String BATCH_VENTILATION_2 = /*$$(*/ "Invoice(s) ventilated" /*)*/;

	/**
	 * Cancel state
	 */
	static final String MOVE_CANCEL_1 = /*$$(*/ "Move should be unreconcile before to cancel the invoice" /*)*/;
	static final String MOVE_CANCEL_2 = /*$$(*/ "Move is ventilated on a closed period, and can't be canceled" /*)*/;
	static final String MOVE_CANCEL_3 = /*$$(*/ "So many accounting operations are used on this move, so move can't be canceled" /*)*/;
	
	static final String INVOICE_CANCEL_1 = /*$$(*/ "Invoice is passed in doubfult debit, and can't be canceled" /*)*/;


	/**
	 * Ventilate state
	 */
	static final String VENTILATE_STATE_1 = /*$$(*/ "Invoice's or credit note's date can't be previous last invoice ventilated's date" /*)*/;
	static final String VENTILATE_STATE_2 = /*$$(*/ "Invoice's or credit note's date can't be previous last invoice ventilated on month's date" /*)*/;
	static final String VENTILATE_STATE_3 = /*$$(*/ "Invoice's or credit note's date can't be previous last invoice ventilated on year's date" /*)*/;
	static final String VENTILATE_STATE_4 = /*$$(*/ "Company %s does not have any invoice's nor credit note's sequence" /*)*/;

	/**
	 * Paybox service and controller
	 */
	static final String PAYBOX_1 = /*$$(*/ "%s :\n You must configure an amount paid for the payment entry %s." /*)*/;
	static final String PAYBOX_2 = /*$$(*/ "%s :\n The amount paid for the CB payment entry can't be higher than payer's balance." /*)*/;
	static final String PAYBOX_3 = /*$$(*/ "%s :\n Caution - You can't pay for an amount higher than selected invoices" /*)*/;
	static final String PAYBOX_4 = /*$$(*/ "%s :\n You must add an email for partner %s." /*)*/;
	static final String PAYBOX_5 = /*$$(*/ "Paybox payment" /*)*/;
	static final String PAYBOX_6 = /*$$(*/ "Payment realized" /*)*/;
	static final String PAYBOX_7 = /*$$(*/ "Payment failed" /*)*/;
	static final String PAYBOX_8 = /*$$(*/ "Payment canceled" /*)*/;
	static final String PAYBOX_9 = /*$$(*/ "Paybox's informations feedback incorrect" /*)*/;

	/**
	 * Payment mode service
	 */
	static final String PAYMENT_MODE_1 = /*$$(*/ "Associated account not configured" /*)*/;
	static final String PAYMENT_MODE_2 = /*$$(*/ "%s :\n Error : You must configure a sequence for the company %s and a payment mode %s" /*)*/;
	static final String PAYMENT_MODE_3 = /*$$(*/ "%s :\n Error : You must configure a journal for the company %s and a payment mode %s" /*)*/;

	/**
	 * Payment voucher control service
	 */
	static final String PAYMENT_VOUCHER_CONTROL_1 = /*$$(*/ "%s :\n Caution, payment entry nb %s, total line's amount imputed is higher than customer's amount paid." /*)*/;
	static final String PAYMENT_VOUCHER_CONTROL_2 = /*$$(*/ "%s :\n There's no line to pay." /*)*/;
	static final String PAYMENT_VOUCHER_CONTROL_3 = /*$$(*/ "%s :\n You must add a journal and a treasury account into payment mode." /*)*/;
	static final String PAYMENT_VOUCHER_CONTROL_4 = /*$$(*/ "%s :\n Payment's amount (%s) is different than Paybox's collected amount (%s)" /*)*/;

	/**
	 * Payment voucher load service
	 */
	static final String PAYMENT_VOUCHER_LOAD_1 = /*$$(*/ "%s :\n You must add an amount paid." /*)*/;

	/**
	 * Payment voucher sequence service
	 */
	static final String PAYMENT_VOUCHER_SEQUENCE_1 = /*$$(*/ "%s :\n You must configure a receipt number (Payment entry) for the company %s" /*)*/;

	/**
	 * Payment voucher tool service
	 */
	static final String PAYMENT_VOUCHER_TOOL_1 = /*$$(*/ "Payment entry's type missing from payment entry %s" /*)*/;

	/**
	 * Account chart controller
	 */
	static final String ACCOUNT_CHART_1 = /*$$(*/ "The chart of account has been loaded successfully" /*)*/;
	static final String ACCOUNT_CHART_2 = /*$$(*/ "Error in account chart import please check the log" /*)*/;
	static final String ACCOUNT_CHART_3 = /*$$(*/ "A chart or chart structure of accounts already exists, please delete the hierarchy between accounts in order to import a new chart." /*)*/;

	/**
	 * Address controller
	 */
	static final String ADDRESS_1 = /*$$(*/ "Sales map" /*)*/;
	static final String ADDRESS_2 = /*$$(*/ "Not implemented for OSM" /*)*/;

	/**
	 * Invoice controller
	 */
	static final String INVOICE_1 = /*$$(*/ "Invoiced canceled" /*)*/;
	static final String INVOICE_2 = /*$$(*/ "Credit note created" /*)*/;
	static final String INVOICE_3 = /*$$(*/ "Please select the invoice(s) to print." /*)*/;
	static final String INVOICE_4 = /*$$(*/ "Refunds from invoice %s" /*)*/;

	/**
	 * Move template controller
	 */
	static final String MOVE_TEMPLATE_1 = /*$$(*/ "Template move is not balanced" /*)*/;
	static final String MOVE_TEMPLATE_2 = /*$$(*/ "Error in move generation" /*)*/;
	static final String MOVE_TEMPLATE_3 = /*$$(*/ "Generated moves" /*)*/;
	static final String MOVE_TEMPLATE_4 = /*$$(*/ "Please fill input lines" /*)*/;


	/**
	 *  Expense service
	 */
	static final String EXPENSE_JOURNAL = /*$$(*/ "You must configure an expenses journal(company : %s)" /*)*/;
	static final String EXPENSE_ACCOUNT = /*$$(*/ "You must configure an expenses account (company : %s)" /*)*/;
	static final String EXPENSE_ACCOUNT_TAX = /*$$(*/ "You must configure an account for expenses taxes (company : %s)" /*)*/;
	static final String EXPENSE_CANCEL_MOVE = /*$$(*/ "Move already used, you must deletter it first" /*)*/;

	static final String EXPENSE_TAX_PRODUCT = /*$$(*/ "No Tax for the product %s" /*)*/;

	static final String USER_PARTNER = /*$$(*/ "You must create a contact for user %s" /*)*/;
	
}